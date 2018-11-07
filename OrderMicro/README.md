# Order MicroService
*Order MicroService for Grizzly Store* <br/>
:panda_face::panda_face::panda_face::panda_face::panda_face:
:panda_face::panda_face::panda_face::panda_face::panda_face:
:panda_face::panda_face::panda_face::panda_face::panda_face:

### Database Structure

* order_sum
  * order_id          [int][FK][PK]
  * status            [string]
    * pending   
    * complete
    * Processing    *
    * Closed    *
    * Canceled  *
    * On Hold   *
  * total_price       [double]
  * email           [int]
  <br/>
* order_line
  * orderline_id    [int][PK]
  * product_id  [int]
  * qty [int]
  * unit_price [double]
  * sub_total [double]
  * order_id [int][FK]
  
  
### API Functionality Requirement
<br/>

* Initial Stage(Initial Deploy)
- [x] getAllOrder (String email);
- [x] getOrderByOrderId (int orderId);
- [x] getOrderByStatus (String email, String status);
- [x] getCartNum (String email)
- [x] deleteOrderById (int orderId);
- [x] addProduct (String email, OrderLine orderline);
    - [x] Sub: addOrder (Order order);
- [x] delProduct (String email, OrderLine orderline);
    - [x] Sub: deleteOrder (Order order);
- [x] updateOrderStatus (String status,int orderId);

* Updating Statge(Further polish)
- [ ] Error handle
- [ ] Update Multiple Order info
    - [ ] QTY
    - [ ] Something
    - [ ] Something
- [ ] Payment validation ???    

:octocat::octocat::octocat::octocat::octocat::octocat:
:octocat::octocat::octocat::octocat::octocat::octocat:
:octocat::octocat::octocat::octocat::octocat::octocat:
