package example.ClassExample;

import java.util.logging.Logger;

/**
 * Java不支援多重繼承，但是interface是可以使用多重繼承概念。
 * 
 */
public class BaseInterface {
    public static void main(String[] args) {
        BirdFly birdFly = new BirdFly();
        birdFly.seagullFly();
        birdFly.sparrowFly();
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
}

interface Sparrow {
    void sparrowFly();
}

class BirdFly implements Seagull, Sparrow {
    Logger logger = Logger.getLogger("BirdFly");

    public void seagullFly() {
        logger.info("seagull fly...");
    }

    public void sparrowFly() {
        logger.info("sparrow fly...");
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