package com.jaeygun.board.user.entity;

import com.jaeygun.board.user.dto.UserDTO;
import lombok.*;

import javax.persistence.*;

/*
 * @Entity: Entity 클래스임을 나타낸다
 * @Table(name = ""): 매핑할 테이블 명을 지정한다
 */
@Entity
@Table(name = "user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /*
     * @Id
     *  > 기본 키를 나타낸다. 모든 entity클래스는 @Id 설정이 필요하다.
     *
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     *  > JPA가 기본 키를 자동으로 생성하도록 한다.
     *
     * @Column
     *  > Entity클래스의 필드는 테이블의 컬럼과 매핑되어 따로 명시하지 않아도 되지만,
     *    매핑될 컬럼명이 다르거나, default값이 다를경우 사용한다.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userUid;

    private String name;

    private String nickName;

    private String id;

    private String password;

    private String emailId;

    private String phoneNumber;

    private String birthday;

    private int role;

    private int regType;

    private long loginTime;

    private long regDate;

    public UserDTO toDTO() {
        return UserDTO.builder()
                .userUid(this.userUid)
                .name(this.name)
                .nickName(this.nickName)
                .id(this.id)
                .password(this.password)
                .emailId(this.emailId)
                .phoneNumber(this.phoneNumber)
                .birthday(this.birthday)
                .role(this.role)
                .regType(this.regType)
                .loginTime(this.loginTime)
                .regDate(this.regDate)
                .build();
    }
}
