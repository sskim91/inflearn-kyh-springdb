package hello.jdbc.domain;

import lombok.Data;

/**
 * Created by sskim on 2022/05/14
 */
@Data
public class Member {

    private String memberId;
    private int money;

    public Member() {

    }

    public Member(String memberId, int money) {
        this.memberId = memberId;
        this.money = money;
    }
}
