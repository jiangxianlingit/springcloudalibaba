/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50628
 Source Host           : localhost:3306
 Source Schema         : springcloud

 Target Server Type    : MySQL
 Target Server Version : 50628
 File Encoding         : 65001

 Date: 26/12/2021 21:32:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for shop_order
-- ----------------------------
DROP TABLE IF EXISTS `shop_order`;
CREATE TABLE `shop_order`  (
  `oid` bigint(20) NOT NULL AUTO_INCREMENT,
  `number` int(11) NULL DEFAULT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  `pname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pprice` double NULL DEFAULT NULL,
  `uid` int(11) NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`oid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 115 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shop_order
-- ----------------------------
INSERT INTO `shop_order` VALUES (1, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (2, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (3, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (4, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (5, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (6, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (7, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (8, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (9, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (10, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (11, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (12, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (13, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (14, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (15, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (16, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (17, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (18, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (19, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (20, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (21, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (22, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (23, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (24, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (25, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (26, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (27, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (28, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (29, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (30, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (31, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (32, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (33, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (34, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (35, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (36, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (37, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (38, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (39, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (40, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (41, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (42, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (43, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (44, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (45, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (46, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (47, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (48, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (49, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (50, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (51, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (52, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (53, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (54, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (55, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (56, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (57, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (58, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (59, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (60, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (61, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (62, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (63, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (64, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (65, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (66, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (67, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (68, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (69, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (70, 1, 2, '小米2', 1400, 1, '测试用户');
INSERT INTO `shop_order` VALUES (71, 1, 2, '小米2', 1400, 1, '测试用户');
INSERT INTO `shop_order` VALUES (72, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (73, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (74, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (75, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (76, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (77, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (78, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (79, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (80, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (81, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (82, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (83, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (84, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (85, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (86, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (87, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (88, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (89, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (90, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (91, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (92, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (93, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (94, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (95, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (96, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (97, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (98, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (99, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (100, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (101, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (102, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (103, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (104, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (105, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (106, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (107, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (108, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (109, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (110, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (111, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (112, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (113, 1, 1, '小米', 1300, 1, '测试用户');
INSERT INTO `shop_order` VALUES (114, 1, 1, '小米', 1300, 1, '测试用户');

-- ----------------------------
-- Table structure for shop_product
-- ----------------------------
DROP TABLE IF EXISTS `shop_product`;
CREATE TABLE `shop_product`  (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pprice` double NULL DEFAULT NULL,
  `stock` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`pid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shop_product
-- ----------------------------
INSERT INTO `shop_product` VALUES (1, '小米', 1300, 5000);
INSERT INTO `shop_product` VALUES (2, '小米2', 1400, 6000);
INSERT INTO `shop_product` VALUES (3, '小米3', 1500, 7000);
INSERT INTO `shop_product` VALUES (4, '小米4', 1600, 8000);

-- ----------------------------
-- Table structure for shop_user
-- ----------------------------
DROP TABLE IF EXISTS `shop_user`;
CREATE TABLE `shop_user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of shop_user
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
