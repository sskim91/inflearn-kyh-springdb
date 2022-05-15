package hello.jdbc.repository;

import hello.jdbc.domain.Member;

/**
 * Created by sskim on 2022/05/15
 */
public interface MemberRepository {
    Member save(Member member);

    Member findById(String memberId);

    void update(String memberId, int money);

    void delete(String memberId);
}
