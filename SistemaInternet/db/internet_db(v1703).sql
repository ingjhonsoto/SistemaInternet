-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-03-2020 a las 12:52:39
-- Versión del servidor: 5.6.26
-- Versión de PHP: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `internet_db`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`Jhon`@`%` PROCEDURE `nsp_insertusuario`()
begin
select * from usuarios;

end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `idcliente` int(11) NOT NULL,
  `dni` char(8) DEFAULT NULL,
  `nombre` varchar(20) NOT NULL,
  `a_paterno` varchar(10) NOT NULL,
  `a_materno` varchar(10) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `celular` int(11) DEFAULT NULL,
  `idestado` char(2) DEFAULT NULL,
  `idusuario` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idcliente`, `dni`, `nombre`, `a_paterno`, `a_materno`, `direccion`, `celular`, `idestado`, `idusuario`) VALUES
(1, NULL, 'STEVEN', 'ALCAS', 'MURILLO', 'NOMARA', NULL, 'AC', 1),
(2, NULL, 'RUBI', 'ELIAS', 'AVALOS', 'NOMARA', 973416545, 'AC', 1),
(3, NULL, 'NATALIA', 'SANCHEZ', 'A', 'NOMARA', 957169763, 'AC', 1),
(4, NULL, 'CELIA', 'CASTRO', 'PRADO', 'NOMARA', 966586844, 'AC', 1),
(5, NULL, 'ERICKA', 'ALVAREZ', 'A', 'NOMARA', 912769628, 'IN', 1),
(6, NULL, 'ELMER', 'RIVERA', 'A', 'NOMARA', 957548761, 'AC', 1),
(7, NULL, 'JAVIER', 'IPANAQUE', 'OTERO', 'NOMARA', NULL, 'IN', 1),
(8, NULL, 'GLORIA', 'QUEVEDO', 'A', 'NOMARA', 947598185, 'IN', 1),
(9, NULL, 'OLGUIN', 'IPANAQUE', 'OTERO', 'NOMARA', NULL, 'IN', 1),
(10, NULL, 'WALTER', 'CHUQUICUSM', 'CORDOVA', 'FATIMA', 934206737, 'AC', 1),
(11, NULL, 'VICTOR RAUL', 'SOTO', 'NAVARRO', 'FATIMA', 942225013, 'IN', 1),
(12, NULL, 'ANGEL ZACARIAS', 'SOTO', 'NAVARRO', 'FATIMA', 969303089, 'AC', 1),
(13, NULL, 'JOSE CARLOS', 'CHECA', 'A', 'FATIMA', NULL, 'IN', 1),
(14, NULL, 'GABRIEL', 'CASTRO', 'ALVAREZ', 'FATIMA', NULL, 'AC', 1),
(15, NULL, 'MAURICIO', 'CASTRO', 'A', 'FATIMA', 943651942, 'AC', 1),
(16, NULL, 'PILAR', 'ATOCHE', 'CRUZ', 'FATIMA', NULL, 'IN', 1),
(17, NULL, 'CLAUDIO', 'ALVAREZ', 'A', 'FATIMA', 927524026, 'IN', 1),
(18, NULL, 'NATIVIDAD', 'OTERO', 'ALVAREZ', '31 DE OCTUBRE', NULL, 'AC', 1),
(19, NULL, 'RAMONA', 'OTERO', 'ALAVREZ', '31 DE OCTUBRE', NULL, 'AC', 1),
(20, NULL, 'JHONY', 'CHIROQUE', 'PERALTA', '31 DE OCTUBRE', 989013868, 'AC', 1),
(21, NULL, 'ANDRES', 'FREYRE', 'ALVAREZ', '31 DE OCTUBRE', 944230517, 'IN', 1),
(22, NULL, 'PEDRO LUIS', 'PERALTA', 'CHIROQUE', '31 DE OCTUBRE', 960904016, 'AC', 1),
(23, NULL, 'VANESA', 'TAVARA', 'PERALTA', 'MIRAFLORES', NULL, 'AC', 1),
(24, NULL, 'GABY', 'PERALTA', 'DIOSES', 'MIRAFLORES', 983052969, 'AC', 1),
(25, NULL, 'JULIA', 'PERALTA', 'A', 'MIRAFLORES', 910289250, 'AC', 1),
(26, NULL, 'CIRO', 'COLONA', 'A', 'MIRAFLORES', 922232934, 'AC', 1),
(27, NULL, 'NEREYRA', 'CHIROQUE', 'A', 'MIRAFLORES', 976379537, 'AC', 1),
(28, NULL, 'FELIPE', 'CHIROQUE', 'A', 'MIRAFLORES', 960780645, 'AC', 1),
(29, NULL, 'MERCEDES', 'PERALTA', 'A', 'MACACARA', 969504968, 'AC', 1),
(30, NULL, 'LUIS', 'ATOCHE', 'A', 'MACACARA', 978382339, 'AC', 1),
(31, NULL, 'JULIANA', 'AGURTO', 'A', 'MACACARA', NULL, 'AC', 1),
(32, NULL, 'LOURDES', 'SAMANE', 'A', 'MACACARA', 968782119, 'AC', 1),
(33, NULL, 'RODOLFO', 'REYES', 'A', 'MACACARA', 981733785, 'AC', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cobros`
--

CREATE TABLE IF NOT EXISTS `cobros` (
  `periodo` char(7) DEFAULT NULL,
  `descripcion` varchar(40) DEFAULT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `idestado` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deudores`
--

CREATE TABLE IF NOT EXISTS `deudores` (
  `periodo` char(7) DEFAULT NULL,
  `descripcion` varchar(40) DEFAULT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `idestado` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE IF NOT EXISTS `estado` (
  `idestado` char(2) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `fechacreacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`idestado`, `descripcion`, `fechacreacion`) VALUES
('AC', 'ACTIVO', '2020-03-15 18:36:05'),
('CO', 'CORTE', '2020-03-15 18:38:40'),
('DE', 'DEUDOR', '2020-03-15 18:36:31'),
('IN', 'INACTIVO', '2020-03-15 18:36:20'),
('PA', 'PAGADO', '2020-03-15 18:36:50');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `infoconexion`
--

CREATE TABLE IF NOT EXISTS `infoconexion` (
  `d_ipcliente` varchar(20) NOT NULL,
  `d_ipequipo` varchar(20) NOT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `idestado` char(2) DEFAULT NULL,
  `fechacontrato` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `infoconexion`
--

INSERT INTO `infoconexion` (`d_ipcliente`, `d_ipequipo`, `idcliente`, `idestado`, `fechacontrato`) VALUES
('192.168.15.8', '192.168.15.7', 2, 'AC', '2019-05-01'),
('192.168.14.31', '192.168.15.29', 1, 'AC', '2019-05-01'),
('192.168.14.32', '192.168.15.29', 1, 'AC', '2019-05-01'),
('192.168.14.19', '192.168.15.18', 3, 'AC', '2019-05-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registropago`
--

CREATE TABLE IF NOT EXISTS `registropago` (
  `idpago` int(11) NOT NULL,
  `periodo` char(7) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `idestado` char(2) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE IF NOT EXISTS `tipo` (
  `idtipo` char(2) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `fechacreacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipo`
--

INSERT INTO `tipo` (`idtipo`, `descripcion`, `fechacreacion`) VALUES
('AD', 'ADMINISTRADOR', '2020-03-15 18:39:19'),
('US', 'USUARIO', '2020-03-15 18:39:32');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `idusuario` int(11) NOT NULL,
  `nombre` varchar(10) NOT NULL,
  `a_paterno` varchar(10) NOT NULL,
  `a_materno` varchar(10) NOT NULL,
  `celular` int(11) DEFAULT NULL,
  `user` varchar(10) NOT NULL,
  `contra` varchar(50) CHARACTER SET utf8 NOT NULL,
  `fechacreacion` datetime DEFAULT NULL,
  `idestado` char(2) NOT NULL,
  `idtipo` char(2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `nombre`, `a_paterno`, `a_materno`, `celular`, `user`, `contra`, `fechacreacion`, `idestado`, `idtipo`) VALUES
(1, 'JHON ALEX', 'SOTO', 'NAVARRO', 950234204, 'JSOTO', 'admin', '2020-03-15 13:12:56', 'AC', 'AD');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `wificasa`
--

CREATE TABLE IF NOT EXISTS `wificasa` (
  `modeloequipo` varchar(20) DEFAULT NULL,
  `dispositivosconectados` int(11) DEFAULT NULL,
  `ipacceso` varchar(20) DEFAULT NULL,
  `c_acceso` varchar(10) DEFAULT NULL,
  `c_wifi` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `idestado` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`idestado`);

--
-- Indices de la tabla `registropago`
--
ALTER TABLE `registropago`
  ADD PRIMARY KEY (`idpago`);

--
-- Indices de la tabla `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`idtipo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
