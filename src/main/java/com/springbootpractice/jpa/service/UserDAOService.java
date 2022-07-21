package service;

import entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
@Transactional
@Service
public class UserDAOService {
    @PersistenceContext
    private EntityManager entityManager;
    public long insert(User user){
        //Open Transaction
        entityManager.persist(user);

        //close transaction
        return user.getId();
    }
}
