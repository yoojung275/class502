package member;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Board {
    private int seq;
    private final String subject;
    private final String content;
    private String poster;


}
