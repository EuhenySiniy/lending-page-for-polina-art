CREATE SEQUENCE IF NOT EXISTS public.feedback_id_sequence
    INCREMENT 1
    START 100
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE SEQUENCE IF NOT EXISTS public.order_id_sequence
    INCREMENT 1
    START 10001
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;

CREATE TABLE IF NOT EXISTS public.pa_orders
(
    order_id bigint NOT NULL DEFAULT nextval('order_id_sequence'::regclass),
    client_name character varying(32) COLLATE pg_catalog."default" NOT NULL,
    client_contact_number bigint NOT NULL,
    photo_link character varying(256) COLLATE pg_catalog."default",
    datetime_create timestamp without time zone DEFAULT now(),
    datetime_modify timestamp without time zone DEFAULT now(),
    order_status character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT pa_orders_pkey PRIMARY KEY (order_id)
);

CREATE TABLE IF NOT EXISTS public.pa_feedbacks
(
    feedback_id bigint NOT NULL DEFAULT nextval('feedback_id_sequence'::regclass),
    feedback_message character varying(255) COLLATE pg_catalog."default" NOT NULL,
    count_stars integer,
    datetime_create timestamp without time zone DEFAULT now(),
    order_id bigint NOT NULL,
    CONSTRAINT pa_feedbacks_pkey PRIMARY KEY (feedback_id),
    CONSTRAINT pa_feedbacks_order_id_fkey FOREIGN KEY (order_id)
    REFERENCES public.pa_orders (order_id) MATCH SIMPLE
                              ON UPDATE NO ACTION
                              ON DELETE NO ACTION
);
