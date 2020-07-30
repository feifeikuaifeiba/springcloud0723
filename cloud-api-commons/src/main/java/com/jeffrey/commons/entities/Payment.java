package com.jeffrey.commons.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Jeffrey
 * @since 2020-07-24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)//开启链式调用
@EqualsAndHashCode(callSuper = false)
public class Payment implements Serializable {

    private static final long serialVersionUID=1L;

    private Integer id;

    private String serial;

}
