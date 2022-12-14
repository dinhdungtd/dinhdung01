
package poly.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class thong tin truy van cua bang MenuOne
 * @version 1.00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nav1Model {
	private int id;
	private String name;
	private int categoryId;
	private String nameSearch;
}
