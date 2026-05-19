public interface CartRepository extends JpaRepository<Cart, Long>{
   List<Cart> findByCustomerEmail(String email);
}