package org.launchcode.models.data;
import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
/***

 * THANKS LaunchCode for this opportunity and information that I will pass on to my child

 */

@Repository
@Transactional
public interface CheeseDao extends CrudRepository <Cheese, Integer> {
}