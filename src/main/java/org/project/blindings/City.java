package org.project.blindings;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data

public class City {
	private Integer cityId;
	private String cityName;
	private Integer stateId;

}
