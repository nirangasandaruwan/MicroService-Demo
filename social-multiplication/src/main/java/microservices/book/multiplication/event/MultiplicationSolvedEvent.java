package microservices.book.multiplication.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Event that models the fact that a {@link microservices.book.multiplication.domain.Multiplication}
 * has been solved in the system. Provides some context information about the multiplication.
 */

@Getter
@ToString
@EqualsAndHashCode
public class MultiplicationSolvedEvent implements Serializable {

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
