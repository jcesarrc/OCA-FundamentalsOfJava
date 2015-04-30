-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-03-2015 a las 20:01:47
-- Versión del servidor: 5.6.20
-- Versión de PHP: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sampleprg4`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `employees`
--

CREATE TABLE IF NOT EXISTS `employees` (
`id` int(11) NOT NULL,
  `document` varchar(20) DEFAULT NULL,
  `lastname` varchar(20) DEFAULT NULL,
  `firstname` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=41 ;

--
-- Volcado de datos para la tabla `employees`
--

INSERT INTO `employees` (`id`, `document`, `lastname`, `firstname`, `phone`) VALUES
(6, '77777', 'aaaa', 'aa', '7777'),
(14, '11', 'hh', '54', '11'),
(30, '897', 'lkjhg', 'kjhg', '54'),
(31, '666', 'jhg', 'kjhg', '5450'),
(39, '34', 'jhg', 'jhgf', '222'),
(40, '99', 'kjhkj', 'hhkjh', '1122');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE IF NOT EXISTS `materia` (
`id` int(11) NOT NULL,
  `cod_materia` int(5) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `curso` varchar(10) NOT NULL,
  `nota` float DEFAULT NULL,
  `nota2` float DEFAULT NULL,
  `nota3` float DEFAULT NULL,
  `prom_nota` float DEFAULT NULL,
  `id_estudiante` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=26 ;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id`, `cod_materia`, `nombre`, `curso`, `nota`, `nota2`, `nota3`, `prom_nota`, `id_estudiante`) VALUES
(11, 5, 'Programacion', 'fgh', 4, 5, 3, 4, '666'),
(12, 2, 'Sociales', 'S233333', 4.5, 4, 5, 3.86667, '666'),
(13, 1, 'Matematicas', 'qww', 5, 5, 4.5, 4.83333, '34'),
(14, 5, 'Programacion', 'dfg', 2, 3, 4, 3, '34'),
(15, 4, 'Descanso', 'gh', 2, 3, 4, 3, '34'),
(21, 3, 'Biologia', 'modificado', 5, 5, 5, 5, '34');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiatabla`
--

CREATE TABLE IF NOT EXISTS `materiatabla` (
  `codigo` int(5) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `materiatabla`
--

INSERT INTO `materiatabla` (`codigo`, `nombre`) VALUES
(1, 'Matematicas'),
(2, 'Sociales'),
(3, 'Biologia'),
(4, 'Descanso'),
(5, 'Programacion'),
(6, 'Cualquier');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `employees`
--
ALTER TABLE `employees`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
 ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `materiatabla`
--
ALTER TABLE `materiatabla`
 ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `employees`
--
ALTER TABLE `employees`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=41;
--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=26;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
