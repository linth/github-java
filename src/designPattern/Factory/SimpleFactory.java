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

import designPattern.Factory.food.Food;

/**
 * 簡單工廠模式
 * ! 請注意 Factory/food下的 class 怎麼寫
 * 
 * 優點:
 * - 簡單實作
 * - 使用 factory 來屏蔽 new instance.
 * - 使用單一class: FoodFactory 來進行判斷要使用哪個 instance.
 * 
 * 缺點:
 * - 大量 if-else
 * 
 * Reference:
 *  - https://www.javadoop.com/post/design-pattern
 */

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


public class SimpleFactory {
    public static void main(String[] args) {
        // noodle.
        FoodFactory.makeFood("noodle");
        // chicken.
        FoodFactory.makeFood("chicken");
    }
}
