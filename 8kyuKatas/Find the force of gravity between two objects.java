/*
Your job is to find the gravitational force between two spherical objects (obj1 , obj2).
input
Two arrays are given :
arr_val (value array), consists of 3 elements
1st element : mass of obj 1
2nd element : mass of obj 2
3rd element : distance between their centers
arr_unit (unit array), consists of 3 elements
1st element : unit for mass of obj 1
2nd element : unit for mass of obj 2
3rd element : unit for distance between their centers
mass units are :
kilogram (kg)
gram (g)
milligram (mg)
microgram (μg)
pound (lb)
distance units are :
meter (m)
centimeter (cm)
millimeter (mm)
micrometer (μm)
feet (ft)
Note
value of G = 6.67 × 10−11 N⋅kg−2⋅m2
1 ft = 0.3048 m
1 lb = 0.453592 kg
return value must be Newton for force (obviously)
μ copy this from here to use it in your solution
*/

public class Solution {

  public static double solution(double[] arrVal, String[] arrUnit) {
    double G = 6.67e-11;
    double mass1 = convertMassToKg(arrVal[0], arrUnit[0]);
    double mass2 = convertMassToKg(arrVal[1], arrUnit[1]);
    double distance = convertDistanceToMeters(arrVal[2], arrUnit[2]);
    return (G * mass1 * mass2) / (distance * distance);
  }
private static double convertMassToKg(double mass, String unit) {
        switch (unit) {
            case "kg":
                return mass;
            case "g":
                return mass * 1e-3;
            case "mg":
                return mass * 1e-6;
            case "μg":
                return mass * 1e-9;
            case "lb":
                return mass * 0.453592;
            default:
                throw new IllegalArgumentException("Unknown mass unit: " + unit);
        }
    }

    // Helper method to convert distance units to meters
    private static double convertDistanceToMeters(double distance, String unit) {
        switch (unit) {
            case "m":
                return distance;
            case "cm":
                return distance * 1e-2;
            case "mm":
                return distance * 1e-3;
            case "μm":
                return distance * 1e-6;
            case "ft":
                return distance * 0.3048;
            default:
                throw new IllegalArgumentException("Unknown distance unit: " + unit);
        }
    }
}
