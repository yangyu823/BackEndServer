package elixir.grizzly.orderMicro.Repositories;

import elixir.grizzly.orderMicro.Entity.OrderLine;

import elixir.grizzly.orderMicro.Entity.OrderSum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface OrderLineRepo extends JpaRepository<OrderLine, Integer> {
    @Query("SELECT e FROM OrderLine e WHERE e.productId=:id AND e.order=:ordersum")
    OrderLine findProductByPid(int id, OrderSum ordersum);

    @Transactional
    List<OrderLine> deleteByOrderlineId(int id);
}
