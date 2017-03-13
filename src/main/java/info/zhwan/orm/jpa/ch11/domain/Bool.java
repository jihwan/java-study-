package info.zhwan.orm.jpa.ch11.domain;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;

/**
 * @author zhwan
 */
@DiscriminatorValue("B") @Getter
public class Bool extends Item {
  private String author;
  private String isbn;
}
