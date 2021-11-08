package example.ClassExample;

import java.util.logging.Logger;

/**
 * interface class 範例
 * 
 * Java不支援多重繼承，但是interface是可以使用多重繼承概念。
 * 
 * ! 兩物件即使介面完全一樣, 也可能會有完全不同的實作。
 * 
 */
public class BaseInterface {
    public static void main(String[] args) {
        BirdFly birdFly = new BirdFly();
        birdFly.seagullFly();
        birdFly.sparrowFly();
        birdFly.eat();
    }
}

/**
 *  -------          -------
 * |Seagull|        |Sparrow|
 *  -------          -------
 *       ^            ^
 *       |            | implements
 *        \          /
 *          \      /
 *          -------
 *         |BirdFly|
 *          -------
 */
interface Seagull {
    void seagullFly();
    void eat();
}

interface Sparrow {
    void sparrowFly();
    void eat();
}

class BirdFly implements Seagull, Sparrow {
    Logger logger = Logger.getLogger("BirdFly");

    public void seagullFly() {
        logger.info("seagull fly...");
    }

    public void sparrowFly() {
        logger.info("sparrow fly...");
    }

    public void eat() {
        // interface 命名方法相同一樣可以，不影響實作部分。
        logger.info("BirdFly eat...");
    }
}


/**
 *  -------          -------
 * |Seagull|        |Sparrow|
 *  -------          -------
 *       ^            ^
 *       |            | extends
 *        \          /
 *          \      /
 *          ---------
 *         |AnimalFly|
 *          ---------
 *             ^
 *             |  implements
 *          --------
 *         |FinalFly|
 *          --------
 */
interface AnimalFly extends Seagull, Sparrow {
    void animalFly();
}

class FinalFly implements AnimalFly {
    Logger logger = Logger.getLogger("FinalFly");

    public void seagullFly() {
        logger.info("seagull fly...");
    }

    public void sparrowFly() {
        logger.info("sparrow fly...");
    }

    public void animalFly() {
        logger.info("animal fly...");
    }

    public void eat() {
        logger.info("FinalFly eat...");
    }
}

/**
 * interface 命名方法相同一樣可以，不影響實作部分。
 * 
 *  --------          --------
 * |Seagull2|        |Sparrow2|
 *  --------          --------
 *       ^            ^
 *       |            | implements
 *        \          /
 *          \      /
 *          ----------
 *         |AnimalFly2|
 *          ----------
 */
interface Seagull2 {
    void seagullFly();
    void showInfo();
}

interface Sparrow2 {
    void sparrowFly();
    void showInfo();
}

class AnimalFly2 implements Seagull2, Sparrow2 {
    Logger logger = Logger.getLogger("AnimalFly2");

    public void seagullFly() {
        logger.info("seagull fly...");
    }

    public void sparrowFly() {
        logger.info("sparrow fly...");
    }
    
    public void showInfo() {
        logger.info("call showInfo...");
    }
}