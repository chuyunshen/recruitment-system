package edu.csc207.recruitment.exceptions.user;

import edu.csc207.recruitment.exceptions.base.RecruitmentSystemException;

public class UserAlreadyExistsException extends RecruitmentSystemException {
    public UserAlreadyExistsException(String format) {
        super(format);
    }
}
