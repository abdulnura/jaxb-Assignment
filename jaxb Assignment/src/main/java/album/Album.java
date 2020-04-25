package album;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@ToString
public class Album {

    private String artist;
    private String title;
    private int year;

    @XmlElementWrapper(name = "tracks")
    @XmlElement(name = "track")
    private List<Track> tracks;

}