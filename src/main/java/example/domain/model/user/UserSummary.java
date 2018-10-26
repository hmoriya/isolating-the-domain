package example.domain.model.user;

/**
 * 利用者サマリ
 */
public class UserSummary {
    UserIdentifier identifier;
    Name name;
    MailAddress mailAddress;
    DateOfBirth dateOfBirth;

    public UserIdentifier identifier() {
        return identifier;
    }

    public Name name() {
        return name;
    }

    public MailAddress mailAddress() {
        return mailAddress;
    }

    public Age age() {
        return dateOfBirth.age();
    }
}
