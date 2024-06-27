package com.product.product;
// import org.springframework.stereotype.Service;

// import java.util.*;

// @Service
// public class DataService {

//     public List<DataItem> dataList = new ArrayList<>();

//     public DataService() {
//         dataList.add(new DataItem(100, "num1", "True"));
//         dataList.add(new DataItem(101, "num2", "False"));
//         dataList.add(new DataItem(102, "num3", "False"));
//         dataList.add(new DataItem(103, "num4", "True"));
//     }

//     public List<DataItem> getDataList() {
//         return dataList;
//     }

//     public DataItem getDataItemById(int id) {
//         for (DataItem item : dataList) {
//             if (item.getNumber() == id) {

//                 return item;
//             }
//         }
//         return null;
//     }

//     public DataItem addDataItem(DataItem newDataItem) {
//         dataList.add(newDataItem);
//         return null;
//     }

//     public DataItem getEmployeeById(int id) {

//         for (DataItem employee : dataList) {

//             if (employee.getNumber() == id) {
//                 return employee;
//             }
//         }
//         return null;
//     }

//     public DataItem Delete(int id) {

//         int index = 0;
//         for (int i = 0; i < dataList.size(); i++) {

//             if (dataList.get(i).getNumber() == id) {
//                 index = i;
//             }
//         }
//         dataList.remove(index);
//         return null;
//     }
// }

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DataService {

    @Autowired
    private dataRepo dataRepository;

    public List<DataItem> getAllDataItems() {
        return dataRepository.findAll();
    }

    public Optional<DataItem> getDataItemById(int id) {
        return dataRepository.findById(id);
    }

    public DataItem addDataItem(DataItem dataItem) {
        return dataRepository.save(dataItem);
    }

    public DataItem updateDataItem(int id, DataItem dataItemDetails) {
        DataItem dataItem = dataRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("DataItem not found"));

        return dataRepository.save(dataItem);
    }

    public DataItem Delete(int id) {
        dataRepository.deleteById(id);
        return null;
    }
}
