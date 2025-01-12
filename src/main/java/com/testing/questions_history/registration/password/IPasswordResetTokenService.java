package com.testing.questions_history.registration.password;

import com.testing.questions_history.user.User;

import java.util.Optional;

public interface IPasswordResetTokenService {

    String validatePasswordResetToken(String theToken);

    Optional<User> findUserByPasswordResetToken(String theToken);

    void resetPassword(User theUser, String password);

    void createPasswordResetTokenForUser(User user, String passwordResetToken);
}
