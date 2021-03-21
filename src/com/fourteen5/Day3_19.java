//package com.fourteen5;
//
//import java.util.LinkedList;
//
//public class Day3_19 {
//}
//
//class ParkingSystem {
//
//    int car1, car2, car3;
//    int size1, size2, size3;
//
//    public ParkingSystem(int big, int medium, int small) {
//        size1 = big;
//        size2 = medium;
//        size3 = small;
//    }
//
//    public boolean addCar(int carType) {
//        switch (carType) {
//            case 1:
//                if (size1 < car1 + 1)
//                    return false;
//                car1++;
//                break;
//            case 2:
//                if (size2 < car2 + 1)
//                    return false;
//                car2++;
//                break;
//            case 3:
//                if (size3 < car3 + 1)
//                    return false;
//                car3++;
//                break;
//        }
//
//        return true;
//    }
//}
//
///**
// * Your ParkingSystem object will be instantiated and called as such:
// * ParkingSystem obj = new ParkingSystem(big, medium, small);
// * boolean param_1 = obj.addCar(carType);
// */