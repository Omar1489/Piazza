package org.piazza.model.edge;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;
import org.piazza.model.BaseModel;
import org.piazza.model.document.Answer;
import org.piazza.model.document.User;

@Edge("userMakeAnswer")
public class UserMakeAnswer extends BaseModel {

    @From(lazy = true)
    User user;
    @To(lazy = true)
    Answer answer;

    public UserMakeAnswer(User user, Answer answer) {
        this.user = user;
        this.answer = answer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
