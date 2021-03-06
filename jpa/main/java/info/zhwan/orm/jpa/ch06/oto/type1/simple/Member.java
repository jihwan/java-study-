package info.zhwan.orm.jpa.ch06.oto.type1.simple;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author zhwan
 */
@Entity
@Getter
public class Member {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToOne
  @JoinColumn(name = "LOCKER_ID", unique = true)
  @Setter private Locker locker;

  public Member(String name) {
    this.name = name;
  }
}
