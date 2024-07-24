package org.choongang.member.repositories;

import org.choongang.member.entities.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
    //CrudRepository -> 쿼리 관련 인터페이스
    Member findByEmail(String email); // -> 디비에서 이메일을 찾아주는 쿼리를 대신 만들어줌
}
