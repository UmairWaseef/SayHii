package com.individual.sayHi.model;

import com.individual.sayHi.Enum.Status;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;
}
