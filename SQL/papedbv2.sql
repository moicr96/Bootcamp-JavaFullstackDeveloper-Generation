-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema papedb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `papedb` ;

-- -----------------------------------------------------
-- Schema papedb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `papedb` DEFAULT CHARACTER SET utf8 ;
USE `papedb` ;

-- -----------------------------------------------------
-- Table `papedb`.`categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papedb`.`categorias` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(250) NULL,
  `descripcion` VARCHAR(250) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `papedb`.`productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `papedb`.`productos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(250) NOT NULL,
  `descripcion` VARCHAR(500) NULL,
  `imagen` VARCHAR(45) NULL,
  `precio` FLOAT NULL,
  `categorias_id` INT NOT NULL,
  PRIMARY KEY (`id`, `categorias_id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  INDEX `fk_productos_categorias_idx` (`categorias_id` ASC) VISIBLE,
  CONSTRAINT `fk_productos_categorias`
    FOREIGN KEY (`categorias_id`)
    REFERENCES `papedb`.`categorias` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
