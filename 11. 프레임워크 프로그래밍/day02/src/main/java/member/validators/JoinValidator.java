package member.validators;


import member.controllers.RequestJoin;
import member.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import global.validators.Validator;

@Component
public class JoinValidator implements Validator<RequestJoin> {

    private MemberDao memberDao;

    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void check(RequestJoin form) {

    }

}
