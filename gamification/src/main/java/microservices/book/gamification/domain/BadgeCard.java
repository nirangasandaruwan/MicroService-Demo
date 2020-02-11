package microservices.book.gamification.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * This class links a Badge to a User. Contains also a timestamp with the moment in which the user got it.
 */

@Getter
@ToString
@EqualsAndHashCode
@Entity
public final class BadgeCard {

    @Id
    @GeneratedValue
    @Column(name = "BADGE_ID")
    private final Long badgeId;

    private final Long userId;
    private final long badgeTimestamp;
    private final Badge badge;

    // Empty constructor for JSON / JPA
    public BadgeCard() {
        this(null, null, 0L, null);
    }

    public BadgeCard(final Long userId, final Badge badge) {
        this(null, userId, System.currentTimeMillis(), badge);
    }

	public BadgeCard(Long badgeId, Long userId, long badgeTimestamp, Badge badge) {
		super();
		this.badgeId = badgeId;
		this.userId = userId;
		this.badgeTimestamp = badgeTimestamp;
		this.badge = badge;
	}

	

}
