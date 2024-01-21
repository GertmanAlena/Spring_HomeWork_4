//package HomeWorksSpring.HomeWorksSpring4.repository;
//
//import HomeWorksSpring.HomeWorksSpring4.model.User;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//import org.springframework.ui.Model;
//
//@Repository
//public class UserRepository {
//
//    //region Поля
//    private final JdbcTemplate jdbc; //для работы с БД
//    //endregion
//
//    //region Конструктор
//    public UserRepository(JdbcTemplate jdbc) {
//        this.jdbc = jdbc;
//    }
//    //endregion
//
//    /**
//     * Метод добавления в БД
//     * @param user
//     * @return
//     */
//    public User save(User user) {
//        String sql = "INSERT INTO userTable VALUES (DEFAULT, ?, ?)";
////        jdbc.update(sql, user.getFirstName(), user.getLastName());
//        return  user;
//    }
//
//}
