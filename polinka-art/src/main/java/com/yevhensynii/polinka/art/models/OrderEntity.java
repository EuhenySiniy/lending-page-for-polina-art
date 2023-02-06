package com.yevhensynii.polinka.art.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "order")
@Table(name = "pa_orders")
public class OrderEntity {
  public enum Status {
    CONSULT,
    NEW,
    IN_PROCESS,
    CANCELED,
    FINISHED
  }

  @Id
  @Column(name = "order_id")
  @SequenceGenerator(name = "id_sequence", sequenceName = "order_id_sequence", allocationSize = 1)
  @GeneratedValue(generator = "id_sequence")
  private Long id;

  @Column(name = "client_name")
  private String clientName;

  @Column(name = "client_contact_number")
  private String clientNumber;

  @Column(name = "client_messenger")
  private String clientMessenger;

  @Column(name = "photo_link")
  private String photoLink;

  @Column(name = "order_status")
  private String status;
}
