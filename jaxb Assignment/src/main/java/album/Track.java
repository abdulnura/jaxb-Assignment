package album;

import javax.xml.bind.annotation.*;

import lombok.*;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Track {

    @XmlValue
    private String title;

    @XmlAttribute
    private int length;

}
