-- phpMyAdmin SQL Dump
-- version 3.4.5deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 28-03-2015 a las 14:31:17
-- Versión del servidor: 5.1.69
-- Versión de PHP: 5.3.6-13ubuntu3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `SistNotas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE IF NOT EXISTS `estudiante` (
  `idestudiante` int(11) NOT NULL AUTO_INCREMENT,
  `documento` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `apellido` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `nombre` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `telefono` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`idestudiante`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`idestudiante`, `documento`, `apellido`, `nombre`, `telefono`) VALUES
(1, '102030', 'Paul', 'Aaron', '5185556');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantemateria`
--

CREATE TABLE IF NOT EXISTS `estudiantemateria` (
  `idestudiantemateria` int(11) NOT NULL,
  `id_materia` int(11) NOT NULL,
  `curso` varchar(10) COLLATE utf8_bin NOT NULL,
  `nota1` float DEFAULT NULL,
  `nota2` float DEFAULT NULL,
  `nota3` float DEFAULT NULL,
  `prom_nota` float DEFAULT NULL,
  `id_estudiante` int(11) NOT NULL,
  `materia_idmateria` int(11) NOT NULL,
  `estudiante_idestudiante` int(11) NOT NULL,
  PRIMARY KEY (`idestudiantemateria`),
  KEY `fk_estudiantemateria_materia_idx` (`materia_idmateria`),
  KEY `fk_estudiantemateria_estudiante1_idx` (`estudiante_idestudiante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE IF NOT EXISTS `materia` (
  `idmateria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`idmateria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=1 ;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `estudiantemateria`
--
ALTER TABLE `estudiantemateria`
  ADD CONSTRAINT `fk_estudiantemateria_estudiante1` FOREIGN KEY (`estudiante_idestudiante`) REFERENCES `estudiante` (`idestudiante`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_estudiantemateria_materia` FOREIGN KEY (`materia_idmateria`) REFERENCES `materia` (`idmateria`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
