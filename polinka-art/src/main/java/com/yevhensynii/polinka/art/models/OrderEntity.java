package com.yevhensynii.polinka.art.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "order")
@Table(name = "pa_orders")
public class OrderEntity {
  public enum Status {
    NEW,
    IN_PROCESS,
    CANCELED,
    FINISHED
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "client_name")
  private String clientName;

  @Column(name = "client_contact_number")
  private int clientNumber;

  @Column(name = "photo_link")
  private String photoLink;

  @Column(name = "datetime_create")
  private ZonedDateTime dateTimeCreate;

  @Column(name = "datetime_modify")
  private ZonedDateTime dateTimeModify;

  @Column(name = "order_status")
  private String status;
}
