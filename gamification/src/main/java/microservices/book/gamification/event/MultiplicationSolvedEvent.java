package microservices.book.gamification.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Event received when a multiplication has been solved in the system.
 * Provides some context information about the multiplication.
 */

@Getter
@ToString
@EqualsAndHashCode
class MultiplicationSolvedEvent implements Serializable {

    private final Long multiplicationResultAttemptId;
    private final Long userId;
    private final boolean correct;
    
    public MultiplicationSolvedEvent(Long multiplicationResultAttemptId, Long userId, boolean correct) {
		super();
		this.multiplicationResultAttemptId = multiplicationResultAttemptId;
		this.userId = userId;
		this.correct = correct;
	}
    
	
	public MultiplicationSolvedEvent() {
		multiplicationResultAttemptId = 0L;
		userId= 0L;
		correct=false;
	}
   

}