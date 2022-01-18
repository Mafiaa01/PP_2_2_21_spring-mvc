package web.Dao;

import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Maclaren", "black", 3, 650));
        carList.add(new Car("Hyundai", "white", 2, 300));
        carList.add(new Car("Lada", "blue", 1, 220));
        carList.add(new Car("Peugeot", "blue", 4, 325));
        carList.add(new Car("Volkswagen", "black", 5, 530));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
