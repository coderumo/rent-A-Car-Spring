package spring.example.entities.concretes;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor//parametresiz constructor
@Entity //db varlığı tablo karşılığı
public class Brand { //tabloya karşılık gelecek class
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Id otomatik artık
	@Column(name="id")
	private int id;
	
	@Column(name="marka")// db de name'e karşılık geliyor
	private String marka;
	
	@OneToMany(mappedBy = "brand")//model nesnesinde hangi alanla ilişkili
	private List <Model> models;//1'e n'in n'i
}


