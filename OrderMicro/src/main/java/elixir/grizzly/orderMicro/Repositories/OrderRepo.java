package elixir.grizzly.orderMicro.Repositories;

import elixir.grizzly.orderMicro.Entity.OrderSum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<OrderSum, Integer> {

    @Query("SELECT e FROM OrderSum e WHERE e.orderId=:id")
    OrderSum findByOrderId(int id);

    @Query("SELECT e FROM OrderSum e WHERE e.email=:email")
    List<OrderSum> findByEmail(String email);

    @Query("SELECT e FROM OrderSum e WHERE e.email=:email AND e.status=:status")
    List<OrderSum> findByStatus(String email, String status);

    @Query("SELECT e FROM OrderSum e WHERE e.email=:email AND e.status='pending'")
    OrderSum findCartNum(String email);

    @Transactional
    List<OrderSum> deleteByOrderId(int id);




}
