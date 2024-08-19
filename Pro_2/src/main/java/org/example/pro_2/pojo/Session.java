package org.example.pro_2.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Session {
    private int SessionID;
    private int ID;
    private LocalDateTime CheckinDate;
    private LocalDateTime CheckoutDate;
}
