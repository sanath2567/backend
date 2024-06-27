package com.product.product;

// import java.util.*;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseStatus;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.server.ResponseStatusException;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;

// import org.springframework.web.bind.annotation.RequestBody;

//     @RestController
//     @RequestMapping("/api/path")
//     public class DataController {
//     @Autowired
//     private DataService dataService;

//     @GetMapping
//     public List<DataItem> getData() {
//     return dataService.getDataList();
//     }

//     @GetMapping("/{id}")
//     public DataItem getDataItemById(@PathVariable int id) {
//     DataItem item = dataService.getDataItemById(id);
//     return item;
//     }

//     @PostMapping
//     public DataItem createDataItem(@RequestBody DataItem newDataItem) {
//     dataService.addDataItem(newDataItem);

//     return newDataItem;
//     }

//     @DeleteMapping("/{id}")
//     public DataItem delete(@PathVariable int id) {
//     DataItem item = dataService.Delete(id);
//     return item;
//     }

//     }



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dataitems")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping
    public List<DataItem> getData() {
        return dataService.getAllDataItems();
    }

    @GetMapping("/{id}")
    public Optional<com.product.product.DataItem> getDataItemById(@PathVariable int id) {
        return dataService.getDataItemById(id);
    }

    @PostMapping
    public DataItem createDataItem(@RequestBody DataItem newDataItem) {
        dataService.addDataItem(newDataItem);
        return newDataItem;
    }

    @DeleteMapping("/{id}")
    public DataItem delete(@PathVariable int id) {
        return dataService.Delete(id);
    }
}
