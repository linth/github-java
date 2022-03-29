/*
 Copyright 2022 Google LLC

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package designPattern.Factory;

/**
 * 簡單工廠模式
 * 
 * Reference:
 *  - https://www.javadoop.com/post/design-pattern
 */
public class SimpleFactory {
    public static void main(String[] args) {
        // noodle.
        FoodFactory.makeFood("noodle");
        // chicken.
        FoodFactory.makeFood("chicken");
    }
}

class FoodFactory {
    public static Food makeFood(String name) {
        if (name.equals("noodle")) {
            //! 使用 parent class or interface class 進行宣告，需要注意 "方法" 是否有包含在內。
            Food noodle = new JapanNoodle();
            noodle.addSpicy("more");
            return noodle;
        } else if (name.equals("chicken")) {
            Food chicken = new TaiwanChicken();
            chicken.addCondiment("potato");
            return chicken;
        } else {
            return null;
        }
    }
}

/**
 * 請多琢磨思考 interface class 部分
 *  - interface class 不能 new instance.
 */
interface FoodInterface {
    public void addSpicy(String amount);
    public void addCondiment(String material);
}

abstract class Food implements FoodInterface {
    public void addSpicy(String amount) {
        System.out.println("[Food] call addSpicy(), and the amount is " + amount + ".");
    }

    public void addCondiment(String material) {
        System.out.println("[Food] call addCondiment(), and the material is " + material + ".");
    }

}

class JapanNoodle extends Food {
    @Override
    public void addSpicy(String amount) {
        System.out.println("[JapanNoodle] call addSpicy(), and the amount is " + amount);
    }
}

class TaiwanChicken extends Food {
    @Override
    public void addCondiment(String material) {
        System.out.println("[TaiwanChicken] call addCondiment(), and the material is " + material);
    }
}
