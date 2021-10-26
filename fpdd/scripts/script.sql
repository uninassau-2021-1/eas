DROP SCHEMA IF EXISTS FPDD;
CREATE SCHEMA FPDD;

# criacao tabela de antecedente do personagem - Sigla = ANTEC
CREATE TABLE IF NOT EXISTS `FPDD`.`TBANTECEDENTEFPDD` (
	`CANTECCODIGO` BIGINT(255) UNSIGNED AUTO_INCREMENT COMMENT 'Codigo de identificacao do antecedente.',
    `NANTECNOMEEN` VARCHAR(100) NULL COMMENT 'Nome do antecedente em ingles.',
    `NANTECNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome do antecedente em portugues(BR).',
    `NANTECNOMEES` VARCHAR(100) NULL COMMENT 'Nome do antecedente em espanhol.',
    `XANTECOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao do antecedente.',
    `FANTECSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status do antecedente (A-Ativo, I-Inativo).',
    `TANTECULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PANTEC_CHAVE` PRIMARY KEY (`CANTECCODIGO`) USING BTREE,
    CONSTRAINT `CHECK_ANTEC_FANTECSTATUS` CHECK ((`FANTECSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Antecedente do personagem.';

####################################################################################################################

# criacao tabela de caracteristicas de antecedente - Sigla = CRTAT
CREATE TABLE IF NOT EXISTS `FPDD`.`TBCARACTANTECFPDD` (
	`CCRTATCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da caracteristica do antecedente.',
	`CANTECCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do antecedente.',
    `NCRTATNOMEEN` VARCHAR(100) NULL COMMENT 'Nome da caracteristica do antecedente em ingles.',
    `NCRTATNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome da caracteristica do antecedente em portugues(BR).',
    `NCRTATNOMEES` VARCHAR(100) NULL COMMENT 'Nome da caracteristica do antecedente em espanhol.',
    `XCRTATOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao da caracteristica do antecedente.',
    `FCRTATSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status da caracteristica do antecedente (A-Ativo, I-Inativo).',
    `TCRTATULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PCRTAT_CHAVE` PRIMARY KEY (`CCRTATCODIGO`) USING BTREE,
    CONSTRAINT `ANTEC_POSSUI_CRTAT` FOREIGN KEY (`CANTECCODIGO`) REFERENCES `FPDD`.`TBANTECEDENTEFPDD`(`CANTECCODIGO`),
    CONSTRAINT `CHECK_CRTAT_FCRTATSTATUS` CHECK ((`FCRTATSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Caracteristica do antecedente do personagem.';

CREATE INDEX `EANTEC_POSSUI_CRTAT` ON `FPDD`.`TBCARACTANTECFPDD` (`CANTECCODIGO` ASC);

#####################################################################################################################

# criacao tabela de vinculo do personagem - Sigla = VINCU
CREATE TABLE IF NOT EXISTS `FPDD`.`TBVINCULOFPDD` (
	`CVINCUCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao do vinculo do antecedente.',
	`CANTECCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do antecedente.',
    `NVINCUNOMEEN` VARCHAR(100) NULL COMMENT 'Nome do vinculo em ingles.',
    `NVINCUNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome do vinculo em portugues(BR).',
    `NVINCUNOMEES` VARCHAR(100) NULL COMMENT 'Nome do vinculo em espanhol.',
    `XVINCUOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao do vinculo.',
    `FVINCUSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status do vinculo (A-Ativo, I-Inativo).',
    `TVINCUULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PVINCU_CHAVE` PRIMARY KEY (`CVINCUCODIGO`) USING BTREE,
    CONSTRAINT `ANTEC_POSSUI_VINCU` FOREIGN KEY (`CANTECCODIGO`) REFERENCES `FPDD`.`TBANTECEDENTEFPDD`(`CANTECCODIGO`),
    CONSTRAINT `CHECK_VINCU_FVINCUSTATUS` CHECK ((`FVINCUSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Vinculo do antecedente do personagem.';

CREATE INDEX `EANTEC_POSSUI_VINCU` ON `FPDD`.`TBVINCULOFPDD` (`CANTECCODIGO` ASC);

#####################################################################################################################

# criacao tabela de ideal d personagem - Sigla = IDEAL
CREATE TABLE IF NOT EXISTS `FPDD`.`TBIDEALFPDD` (
	`CIDEALCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao do ideal do antecedente.',
	`CANTECCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do antecedente.',
    `NIDEALNOMEEN` VARCHAR(100) NULL COMMENT 'Nome do ideal em ingles.',
    `NIDEALNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome do ideal em portugues(BR).',
    `NIDEALNOMEES` VARCHAR(100) NULL COMMENT 'Nome do ideal em espanhol.',
    `XIDEALOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao do ideal.',
    `FIDEALSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status do ideal (A-Ativo, I-Inativo).',
    `TIDEALULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PIDEAL_CHAVE` PRIMARY KEY (`CIDEALCODIGO`) USING BTREE,
    CONSTRAINT `ANTEC_POSSUI_IDEAL` FOREIGN KEY (`CANTECCODIGO`) REFERENCES `FPDD`.`TBANTECEDENTEFPDD`(`CANTECCODIGO`),
    CONSTRAINT `CHECK_IDEAL_FIDEALSTATUS` CHECK ((`FIDEALSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Ideal do antecedente do personagem.';

CREATE INDEX `EANTEC_POSSUI_IDEAL` ON `FPDD`.`TBIDEALFPDD` (`CANTECCODIGO` ASC);

#####################################################################################################################

# criacao tabela de traco do personagem - Sigla = TCPSG
CREATE TABLE IF NOT EXISTS `FPDD`.`TBTRACOPERSOFPDD` (
	`CTCPSGCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao do traco do antecedente.',
	`CANTECCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do antecedente.',
    `NTCPSGNOMEEN` VARCHAR(100) NULL COMMENT 'Nome do traco do personagem em ingles.',
    `NTCPSGNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome do traco do personagem em portugues(BR).',
    `NTCPSGNOMEES` VARCHAR(100) NULL COMMENT 'Nome do traco do personagem em espanhol.',
    `XTCPSGOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao do traco do personagem.',
    `FTCPSGSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status do traco do personagem (A-Ativo, I-Inativo).',
    `TTCPSGULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PTCPSG_CHAVE` PRIMARY KEY (`CTCPSGCODIGO`) USING BTREE,
    CONSTRAINT `ANTEC_POSSUI_TCPSG` FOREIGN KEY (`CANTECCODIGO`) REFERENCES `FPDD`.`TBANTECEDENTEFPDD`(`CANTECCODIGO`),
    CONSTRAINT `CHECK_TCPSG_FTCPSGSTATUS` CHECK ((`FTCPSGSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Traco do antecedente do personagem.';

CREATE INDEX `EANTEC_POSSUI_TCPSG` ON `FPDD`.`TBTRACOPERSOFPDD` (`CANTECCODIGO` ASC);

#####################################################################################################################

# criacao tabela de defeito do personagem - Sigla = DEFTO
CREATE TABLE IF NOT EXISTS `FPDD`.`TBDEFEITOFPDD` (
	`CDEFTOCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao do defeito do antecedente.',
	`CANTECCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do antecedente.',
    `NDEFTONOMEEN` VARCHAR(100) NULL COMMENT 'Nome do defeito em ingles.',
    `NDEFTONOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome do defeito em portugues(BR).',
    `NDEFTONOMEES` VARCHAR(100) NULL COMMENT 'Nome do defeito em espanhol.',
    `XDEFTOOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao do defeito.',
    `FDEFTOSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status do defeito (A-Ativo, I-Inativo).',
    `TDEFTOULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PDEFTO_CHAVE` PRIMARY KEY (`CDEFTOCODIGO`) USING BTREE,
    CONSTRAINT `ANTEC_POSSUI_DEFTO` FOREIGN KEY (`CANTECCODIGO`) REFERENCES `FPDD`.`TBANTECEDENTEFPDD`(`CANTECCODIGO`),
    CONSTRAINT `CHECK_DEFTO_FDEFTOSTATUS` CHECK ((`FDEFTOSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Defeito do antecedente do personagem.';

CREATE INDEX `EANTEC_POSSUI_DEFTO` ON `FPDD`.`TBDEFEITOFPDD` (`CANTECCODIGO` ASC);

#####################################################################################################################

# criacao tabela de tendencia do personagem - Sigla = TENDE
CREATE TABLE IF NOT EXISTS `FPDD`.`TBTENDENCIAFPDD` (
	`CTENDECODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da tendencia.',
    `NTENDENOMEEN` VARCHAR(100) NULL COMMENT 'Nome da tendencia em ingles.',
    `NTENDENOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome da tendencia em portugues.',
    `NTENDENOMEES` VARCHAR(100) NULL COMMENT 'Nome da tendencia em espanhol.',
    `XTENDEOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao da tendencia.',
    `FTENDESTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status da tendencia (A-Ativo, I-Inativo).',
    `TTENDEULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PTENDE_CHAVE` PRIMARY KEY (`CTENDECODIGO`) USING BTREE,
    CONSTRAINT `CHECK_TENDE_FTENDESTATUS` CHECK ((`FTENDESTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Tendencia do personagem.';

#####################################################################################################################

# criacao tabela de relacionamento entre tendencia e vinculo do personagem - Sigla = TDVNC
CREATE TABLE IF NOT EXISTS `FPDD`.`TBTENDVINCFPDD` (
	`CTDVNCCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do relacionamento entre tendencia e vinculo.',
	`CTENDECODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da tendencia.',
	`CVINCUCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do vinculo.',
    `TTDVNCULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PTDVNC_CHAVE` PRIMARY KEY (`CTDVNCCODIGO`) USING BTREE,
    CONSTRAINT `TENDE_POSSUI_TDVNC` FOREIGN KEY (`CTENDECODIGO`) REFERENCES `FPDD`.`TBTENDENCIAFPDD`(`CTENDECODIGO`),
    CONSTRAINT `VINCU_POSSUI_TDVNC` FOREIGN KEY (`CVINCUCODIGO`) REFERENCES `FPDD`.`TBVINCULOFPDD`(`CVINCUCODIGO`),
    CONSTRAINT `UTDVNC_POSSUI_TENDE_VINCU` UNIQUE (`CTENDECODIGO`, `CVINCUCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Relacionamento entre tendencia e vinculo.';

CREATE INDEX `ETENDEC_POSSUI_TDVNC` ON `FPDD`.`TBTENDVINCFPDD` (`CTENDECODIGO` ASC);

CREATE INDEX `EVINCU_POSSUI_TDVNC` ON `FPDD`.`TBTENDVINCFPDD` (`CVINCUCODIGO` ASC);

#####################################################################################################################

# criacao tabela de relacionamento entre tendencia e ideal do personagem - Sigla = TDIDE
CREATE TABLE IF NOT EXISTS `FPDD`.`TBTENDIDEALFPDD` (
	`CTDIDECODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do relacionamento entre tendencia e ideal.',
	`CTENDECODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da tendencia.',
	`CIDEALCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao dos ideal.',
    `TTDIDEULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PTDIDE_CHAVE` PRIMARY KEY (`CTDIDECODIGO`) USING BTREE,
    CONSTRAINT `TENDE_POSSUI_TDIDE` FOREIGN KEY (`CTENDECODIGO`) REFERENCES `FPDD`.`TBTENDENCIAFPDD`(`CTENDECODIGO`),
    CONSTRAINT `IDEAL_POSSUI_TDIDE` FOREIGN KEY (`CIDEALCODIGO`) REFERENCES `FPDD`.`TBIDEALFPDD`(`CIDEALCODIGO`),
    CONSTRAINT `UTDIDE_POSSUI_TENDE_IDEAL` UNIQUE (`CTENDECODIGO`, `CIDEALCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Relacionamento entre tendencia e ideal.';

CREATE INDEX `ETENDEC_POSSUI_TDIDE` ON `FPDD`.`TBTENDIDEALFPDD` (`CTENDECODIGO` ASC);

CREATE INDEX `EIDEAL_POSSUI_TDIDE` ON `FPDD`.`TBTENDIDEALFPDD` (`CIDEALCODIGO` ASC);

#####################################################################################################################

# criacao tabela de relacionamento entre tendencia e traco do personagem - Sigla = TDTPG
CREATE TABLE IF NOT EXISTS `FPDD`.`TBTENDTRACPERSFPDD` (
	`CTDTPGCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do relacionamento entre tendencia e traco de personagem.',
	`CTENDECODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da tendencia.',
	`CTCPSGCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do traco de personagem.',
    `TTDTPGULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PTDTPG_CHAVE` PRIMARY KEY (`CTDTPGCODIGO`) USING BTREE,
    CONSTRAINT `TENDE_POSSUI_TDTPG` FOREIGN KEY (`CTENDECODIGO`) REFERENCES `FPDD`.`TBTENDENCIAFPDD`(`CTENDECODIGO`),
    CONSTRAINT `TCPSG_POSSUI_TDTPG` FOREIGN KEY (`CTCPSGCODIGO`) REFERENCES `FPDD`.`TBTRACOPERSOFPDD`(`CTCPSGCODIGO`),
    CONSTRAINT `UTDTPG_POSSUI_TENDE_TCPSG` UNIQUE (`CTENDECODIGO`, `CTCPSGCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Relacionamento entre tendencia e traco de personagem.';

CREATE INDEX `ETENDEC_POSSUI_TDTPG` ON `FPDD`.`TBTENDTRACPERSFPDD` (`CTENDECODIGO` ASC);

CREATE INDEX `ETCPSG_POSSUI_TDTPG` ON `FPDD`.`TBTENDTRACPERSFPDD` (`CTCPSGCODIGO` ASC);

#####################################################################################################################

# criacao tabela de relacionamento entre tendencia e defeito do personagem - Sigla = TDDEF
CREATE TABLE IF NOT EXISTS `FPDD`.`TBTENDDEFEITOFPDD` (
	`CTDDEFCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do relacionamento entre tendencia e defeito.',
	`CTENDECODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da tendencia.',
	`CDEFTOCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do defeito.',
    `TTDDEFULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PTDDEF_CHAVE` PRIMARY KEY (`CTDDEFCODIGO`) USING BTREE,
    CONSTRAINT `TENDE_POSSUI_TDDEF` FOREIGN KEY (`CTENDECODIGO`) REFERENCES `FPDD`.`TBTENDENCIAFPDD`(`CTENDECODIGO`),
    CONSTRAINT `TCPSG_POSSUI_TDDEF` FOREIGN KEY (`CDEFTOCODIGO`) REFERENCES `FPDD`.`TBDEFEITOFPDD`(`CDEFTOCODIGO`),
    CONSTRAINT `UTDDEF_POSSUI_TENDE_DEFTO` UNIQUE (`CTENDECODIGO`, `CDEFTOCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Relacionamento entre tendencia e defeito.';

CREATE INDEX `ETENDEC_POSSUI_TDDEF` ON `FPDD`.`TBTENDDEFEITOFPDD` (`CTENDECODIGO` ASC);

CREATE INDEX `EDEFTO_POSSUI_TDDEF` ON `FPDD`.`TBTENDDEFEITOFPDD` (`CDEFTOCODIGO` ASC);

#####################################################################################################################

# criacao tabela de classe do personagem - Sigla = CLASS
CREATE TABLE IF NOT EXISTS `FPDD`.`TBCLASSEFPDD` (
    `CCLASSCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da classe.',
    `NCLASSNOMEEN` VARCHAR(100) NULL COMMENT 'Nome da classe em ingles.',
    `NCLASSNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome da classe em portugues(BR).',
    `NCLASSNOMEES` VARCHAR(100) NULL COMMENT 'Nome da classe em espanhol.',
    `XCLASSOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao da classe.',
    `FCLASSSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status da classe (A-Ativo, I-Inativo).',
    `TCLASSULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PCLASS_CHAVE` PRIMARY KEY (`CCLASSCODIGO`) USING BTREE,
    CONSTRAINT `CHECK_CLASS_FCLASSSTATUS` CHECK ((`FCLASSSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Classe do personagem.';

#####################################################################################################################

# criacao tabela de subclasse do personagem - Sigla = SBCLS
CREATE TABLE IF NOT EXISTS `FPDD`.`TBSUBCLASSEFPDD` (
    `CSBCLSCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da subclasse.',
    `CCLASSCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da classe.',
    `NSBCLSNOMEEN` VARCHAR(100) NULL COMMENT 'Nome da subclasse.',
    `NSBCLSNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome da subclasse.',
    `NSBCLSNOMEES` VARCHAR(100) NULL COMMENT 'Nome da subclasse.',
    `XSBCLSOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao da subclasse.',
    `FSBCLSSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status da subclasse (A-Ativo, I-Inativo).',
    `TSBCLSULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PSBCLS_CHAVE` PRIMARY KEY (`CSBCLSCODIGO`) USING BTREE,
    CONSTRAINT `CLASS_POSSUI_SBCLS` FOREIGN KEY (`CCLASSCODIGO`) REFERENCES `FPDD`.`TBCLASSEFPDD`(`CCLASSCODIGO`),
    CONSTRAINT `CHECK_SBCLS_FSBCLSSTATUS` CHECK ((`FSBCLSSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Subclasse do personagem.';

CREATE INDEX `ECLASS_POSSUI_SBCLS` ON `FPDD`.`TBSUBCLASSEFPDD` (`CCLASSCODIGO` ASC);

#####################################################################################################################

# criacao tabela de raca do personagem - Sigla = RACAS
CREATE TABLE IF NOT EXISTS `FPDD`.`TBRACAFPDD` (
    `CRACASCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da raca.',
    `NRACASNOMEEN` VARCHAR(100) NULL COMMENT 'Nome da raca em ingles.',
    `NRACASNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome da raca em portugues(BR).',
    `NRACASNOMEES` VARCHAR(100) NULL COMMENT 'Nome da raca em espanhol.',
    `VRACASALTURAMAX` SMALLINT(4) UNSIGNED NOT NULL COMMENT 'Altura maxima da raca.',
    `VRACASALTURAMIN` SMALLINT(4) UNSIGNED NOT NULL COMMENT 'Altura minima da raca.',
    `VRACASPESOMAX` NUMERIC(4,2) NOT NULL COMMENT 'Peso maximo da raca.',
    `VRACASPESOMIN` NUMERIC(4,2) NOT NULL COMMENT 'Peso minimo da raca.',
    `ARACASIDADEMAX` SMALLINT(4) UNSIGNED NOT NULL COMMENT 'Idade maxima da raca.',
    `ARACASIDADEMIN` SMALLINT(4) UNSIGNED NOT NULL COMMENT 'Idade minima da raca.',
    `XRACASOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao da raca.',
    `FRACASSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status da raca (A-Ativo, I-Inativo).',
    `TRACASULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PRACAS_CHAVE` PRIMARY KEY (`CRACASCODIGO`) USING BTREE,
    CONSTRAINT `CHECK_RACAS_FRACASSTATUS` CHECK ((`FRACASSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Raca do personagem.';

#####################################################################################################################

# criacao tabela de subraca do personagem - Sigla = SBRAC
CREATE TABLE IF NOT EXISTS `FPDD`.`TBSUBRACAFPDD` (
    `CSBRACCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da subraca.',
    `CRACASCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da raca.',
    `NSBRACNOMEEN` VARCHAR(100) NULL COMMENT 'Nome da subraca em ingles.',
    `NSBRACNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome da subraca em portugues.',
    `NSBRACNOMEES` VARCHAR(100) NULL COMMENT 'Nome da subraca em espanhol.',
    `XSBRACOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao da subraca.',
    `FSBRACSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status da subraca (A-Ativo, I-Inativo).',
    `TSBRACULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PSBRAC_CHAVE` PRIMARY KEY (`CSBRACCODIGO`) USING BTREE,
    CONSTRAINT `RACAS_POSSUI_SBRAC` FOREIGN KEY (`CRACASCODIGO`) REFERENCES `FPDD`.`TBRACAFPDD`(`CRACASCODIGO`),
    CONSTRAINT `CHECK_SBRAC_FSBRACSTATUS` CHECK ((`FSBRACSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Subraca do personagem.';

CREATE INDEX `ERACAS_POSSUI_SBRAC` ON `FPDD`.`TBSUBRACAFPDD` (`CRACASCODIGO` ASC);

#####################################################################################################################

# criacao tabela de cor da pele do personagem - Sigla = CRPEL
CREATE TABLE IF NOT EXISTS `FPDD`.`TBCORPELEFPDD` (
    `CCRPELCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da cor da pele.',
    `NCRPELNOMEEN` VARCHAR(100) NULL COMMENT 'Nome da cor da pele em ingles.',
    `NCRPELNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome da cor da pele em portugues(BR).',
    `NCRPELNOMEES` VARCHAR(100) NULL COMMENT 'Nome da cor da pele em espanhol.',
    `XCRPELOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao da cor da pele.',
    `FCRPELSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status da cor da pele (A-Ativo, I-Inativo).',
    `TCRPELULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PCRPEL_CHAVE` PRIMARY KEY (`CCRPELCODIGO`) USING BTREE,
    CONSTRAINT `CHECK_CRPEL_FCRPELSTATUS` CHECK ((`FCRPELSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Cor da pele do personagem.';

#####################################################################################################################

# criacao tabela de cor do cabelo do personagem - Sigla = CRCBL
CREATE TABLE IF NOT EXISTS `FPDD`.`TBCORCABELOFPDD` (
    `CCRCBLCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da cor do cabelo.',
    `NCRCBLNOMEEN` VARCHAR(100) NULL COMMENT 'Nome da cor do cabelo.',
    `NCRCBLNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome da cor do cabelo.',
    `NCRCBLNOMEES` VARCHAR(100) NULL COMMENT 'Nome da cor do cabelo.',
    `XCRCBLOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao da cor do cabelo.',
    `FCRCBLSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status da cor do cabelo (A-Ativo, I-Inativo).',
    `TCRCBLULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PCRCBL_CHAVE` PRIMARY KEY (`CCRCBLCODIGO`) USING BTREE,
    CONSTRAINT `CHECK_CRCBL_FCRCBLSTATUS` CHECK ((`FCRCBLSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Cor do cabelo do personagem.';

#####################################################################################################################

# criacao tabela de cor dos olhos do personagem - Sigla = CROLH
CREATE TABLE IF NOT EXISTS `FPDD`.`TBCOROLHOSFPDD` (
    `CCROLHCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da cor dos olhos.',
    `NCROLHNOMEEN` VARCHAR(100) NULL COMMENT 'Nome da cor dos olhos em ingles.',
    `NCROLHNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome da cor dos olhos em portugues(BR).',
    `NCROLHNOMEES` VARCHAR(100) NULL COMMENT 'Nome da cor dos olhos em ingles.',
    `XCROLHOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao da cor dos olhos.',
    `FCROLHSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status da cor dos olhos (A-Ativo, I-Inativo).',
    `TCROLHULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PCROLH_CHAVE` PRIMARY KEY (`CCROLHCODIGO`) USING BTREE,
    CONSTRAINT `CHECK_CROLH_FCROLHSTATUS` CHECK ((`FCROLHSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Cor dos olhos do personagem.';

#####################################################################################################################

# criacao tabela de nome do personagem - Sigla = NMPSG
CREATE TABLE IF NOT EXISTS `FPDD`.`TBNOMEPERSFPDD` (
    `CNMPSGCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao do nome.',
    `NNMPSGNOMEEN` VARCHAR(100) NULL COMMENT 'Nome do personagem em ingles.',
    `NNMPSGNOMEPTBR` VARCHAR(100) NOT NULL COMMENT 'Nome do personagem em portugues(BR).',
    `NNMPSGNOMEES` VARCHAR(100) NULL COMMENT 'Nome do personagem em espanhol.',
    `XNMPSGOBSERVACAO` TEXT(2000) NULL COMMENT 'Observacao do nome do personagem.',
    `FNMPSGSTATUS` CHAR(1) NOT NULL DEFAULT 'A' COMMENT 'Status do nome do personagem (A-Ativo, I-Inativo).',
    `TNMPSGULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PNMPSG_CHAVE` PRIMARY KEY (`CNMPSGCODIGO`) USING BTREE,
    CONSTRAINT `CHECK_NMPSG_FNMPSGSTATUS` CHECK ((`FNMPSGSTATUS`) IN ('A', 'I'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Nome do personagem.';

#####################################################################################################################

# criacao tabela de relacionamento entre subraca e cor da pele do personagem - Sigla = SRCPL
CREATE TABLE IF NOT EXISTS `FPDD`.`TBSBRACACRPELEFPDD` (
	`CSRCPLCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do relacionamento entre subraca e cor da pele.',
    `CSBRACCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da subraca.',
    `CCRPELCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da cor da pele.',
    `TSRCPLULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PSRCPL_CHAVE` PRIMARY KEY (`CSRCPLCODIGO`) USING BTREE,
    CONSTRAINT `SBRAC_POSSUI_SRCPL` FOREIGN KEY (`CSBRACCODIGO`) REFERENCES `FPDD`.`TBSUBRACAFPDD`(`CSBRACCODIGO`),
    CONSTRAINT `TCPSG_POSSUI_SRCPL` FOREIGN KEY (`CCRPELCODIGO`) REFERENCES `FPDD`.`TBCORPELEFPDD`(`CCRPELCODIGO`),
    CONSTRAINT `USRCPL_POSSUI_SBRAC_CRPEL` UNIQUE (`CSBRACCODIGO`, `CCRPELCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Relacionamento entre subraca e cor da pele.';

CREATE INDEX `ESBRAC_POSSUI_SRCPL` ON `FPDD`.`TBSBRACACRPELEFPDD` (`CSBRACCODIGO` ASC);

CREATE INDEX `ECRPEL_POSSUI_SRCPL` ON `FPDD`.`TBSBRACACRPELEFPDD` (`CCRPELCODIGO` ASC);

#####################################################################################################################

# criacao tabela de relacionamento entre subraca e cor do cabelo do personagem - Sigla = SRCCB
CREATE TABLE IF NOT EXISTS `FPDD`.`TBSBRACACRCBLFPDD` (
	`CSRCCBCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do relacionamento entre subraca e cor do cabelo.',
    `CSBRACCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da subraca.',
    `CCRCBLCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da cor do cabelo.',
    `TSRCCBULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PSRCCB_CHAVE` PRIMARY KEY (`CSRCCBCODIGO`) USING BTREE,
    CONSTRAINT `SBRAC_POSSUI_SRCCB` FOREIGN KEY (`CSBRACCODIGO`) REFERENCES `FPDD`.`TBSUBRACAFPDD`(`CSBRACCODIGO`),
    CONSTRAINT `TCPSG_POSSUI_SRCCB` FOREIGN KEY (`CCRCBLCODIGO`) REFERENCES `FPDD`.`TBCORCABELOFPDD`(`CCRCBLCODIGO`),
    CONSTRAINT `USRCCB_POSSUI_SBRAC_CRCBL` UNIQUE (`CSBRACCODIGO`, `CCRCBLCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Relacionamento entre subraca e cor do cabelo.';

CREATE INDEX `ESBRAC_POSSUI_SRCCB` ON `FPDD`.`TBSBRACACRCBLFPDD` (`CSBRACCODIGO` ASC);

CREATE INDEX `ECRCBL_POSSUI_SRCCB` ON `FPDD`.`TBSBRACACRCBLFPDD` (`CCRCBLCODIGO` ASC);

#####################################################################################################################

# criacao tabela de relacionamento entre subraca e cor dos olhos do personagem - Sigla = SRCOL
CREATE TABLE IF NOT EXISTS `FPDD`.`TBSBRACACROLHFPDD` (
	`CSRCOLCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do relacionamento entre subraca e cor dos olhos do personagem.',
    `CSBRACCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da subraca.',
    `CCROLHCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do cor dos olhos.',
    `TSRCOLULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PSRCOL_CHAVE` PRIMARY KEY (`CSRCOLCODIGO`) USING BTREE,
    CONSTRAINT `SBRAC_POSSUI_SRCOL` FOREIGN KEY (`CSBRACCODIGO`) REFERENCES `FPDD`.`TBSUBRACAFPDD`(`CSBRACCODIGO`),
    CONSTRAINT `TCPSG_POSSUI_SRCOL` FOREIGN KEY (`CCROLHCODIGO`) REFERENCES `FPDD`.`TBCOROLHOSFPDD`(`CCROLHCODIGO`),
    CONSTRAINT `USRCOL_POSSUI_SBRAC_CROLH` UNIQUE (`CSBRACCODIGO`, `CCROLHCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Relacionamento entre subraca e cor dos olhos do personagem.';

CREATE INDEX `ESBRAC_POSSUI_SRCOL` ON `FPDD`.`TBSBRACACROLHFPDD` (`CSBRACCODIGO` ASC);

CREATE INDEX `ECROLH_POSSUI_SRCOL` ON `FPDD`.`TBSBRACACROLHFPDD` (`CCROLHCODIGO` ASC);

#####################################################################################################################

# criacao tabela de relacionamento entre subraca e nome do personagem - Sigla = SRNPG
CREATE TABLE IF NOT EXISTS `FPDD`.`TBSBRACANMPSGFPDD` (
	`CSRNPGCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do relacionamento entre subraca e nome do personagem.',
    `CSBRACCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da subraca.',
    `CNMPSGCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do nome do personagem.',
    `TSRNPGULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PSRNPG_CHAVE` PRIMARY KEY (`CSRNPGCODIGO`) USING BTREE,
    CONSTRAINT `SBRAC_POSSUI_SRNPG` FOREIGN KEY (`CSBRACCODIGO`) REFERENCES `FPDD`.`TBSUBRACAFPDD`(`CSBRACCODIGO`),
    CONSTRAINT `TCPSG_POSSUI_SRNPG` FOREIGN KEY (`CNMPSGCODIGO`) REFERENCES `FPDD`.`TBNOMEPERSFPDD`(`CNMPSGCODIGO`),
    CONSTRAINT `USRNPG_POSSUI_SBRAC_NMPSG` UNIQUE (`CSBRACCODIGO`, `CNMPSGCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Relacionamento entre subraca e nome do personagem.';

CREATE INDEX `ESBRAC_POSSUI_SRNPG` ON `FPDD`.`TBSBRACANMPSGFPDD` (`CSBRACCODIGO` ASC);

CREATE INDEX `ENMPSG_POSSUI_SRNPG` ON `FPDD`.`TBSBRACANMPSGFPDD` (`CNMPSGCODIGO` ASC);

#####################################################################################################################

# criacao tabela de ficha do jogador - Sigla = FCHJG
CREATE TABLE IF NOT EXISTS `FPDD`.`TBFICHAJOGADORFPDD` (
    `CFCHJGCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao da ficha do jogador.',
    `CCLASSCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da classe.',
    `CRACASCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da raca.',
    `CANTECCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do antecedente.',
    `NFCHJGNOMEJOGADOR` VARCHAR(100) NOT NULL COMMENT 'Nome do jogador.',
    `TFCHJGULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PFCHJG_CHAVE` PRIMARY KEY (`CFCHJGCODIGO`) USING BTREE,
    CONSTRAINT `CLASS_POSSUI_FCHJG` FOREIGN KEY (`CCLASSCODIGO`) REFERENCES `FPDD`.`TBCLASSEFPDD`(`CCLASSCODIGO`),
    CONSTRAINT `RACAS_POSSUI_FCHJG` FOREIGN KEY (`CRACASCODIGO`) REFERENCES `FPDD`.`TBRACAFPDD`(`CRACASCODIGO`),
    CONSTRAINT `ANTEC_POSSUI_FCHJG` FOREIGN KEY (`CANTECCODIGO`) REFERENCES `FPDD`.`TBANTECEDENTEFPDD`(`CANTECCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Ficha do jogador.';

CREATE INDEX `ECLASS_POSSUI_FCHJG` ON `FPDD`.`TBFICHAJOGADORFPDD` (`CCLASSCODIGO` ASC);

CREATE INDEX `ERACAS_POSSUI_FCHJG` ON `FPDD`.`TBFICHAJOGADORFPDD` (`CRACASCODIGO` ASC);

CREATE INDEX `EANTEC_POSSUI_FCHJG` ON `FPDD`.`TBFICHAJOGADORFPDD` (`CANTECCODIGO` ASC);

#####################################################################################################################

# criacao tabela do usuario - Sigla = USUAR
CREATE TABLE IF NOT EXISTS `FPDD`.`TBUSUARIOFPDD` (
    `CUSUARCODIGO` BIGINT(255) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Codigo de identificacao do usuario.',
    `EUSUARLOGIN` VARCHAR(50) NOT NULL COMMENT 'Login do usuario.',
    `EUSUAREMAIL` VARCHAR(100) NOT NULL COMMENT 'Email do usuario.',
    `EUSUARSENHA` VARCHAR(30) NOT NULL COMMENT 'Senha do usuario.',
    `NUSUARNOME` VARCHAR(20) NOT NULL COMMENT 'Nome do usuario.',
    `NUSUARSOBRENOME` VARCHAR(100) NOT NULL COMMENT 'Sobrenome do usuario.',
    `NUSUARAPELIDO` VARCHAR(50) NOT NULL COMMENT 'Apelido do usuario.',
    `DUSUARNASCIMENTO` DATE NOT NULL COMMENT 'Data de nascimento do usuario.',
    `AUSUARTELEFONE` VARCHAR(15) NULL COMMENT 'numero de telefone do usuario.',
    `AUSUARCELULAR` VARCHAR(15) NULL COMMENT 'numero de celular do usuario.',
    `EUSUARPAIS` VARCHAR(30) NULL COMMENT 'Pais de origem do usuario',
    `EUSUARENDERECO` VARCHAR(150) NULL COMMENT 'Endereco do usuario',
    `AUSUARNUMEROENDERECO` VARCHAR(20) NULL COMMENT 'Numero de endereco do usuario',
    `EUSUARBAIRRO` VARCHAR(50) NULL COMMENT 'Bairro do usuario',
    `EUSUARCIDADE` VARCHAR(50) NULL COMMENT 'Cidade do usuario',
    `EUSUARUF` CHAR(2) NULL COMMENT 'Estado do usuario',
    `CUSUARCEP` VARCHAR(20) NULL COMMENT 'CEP do usuario',
    `FUSUARIDIOMA` VARCHAR(10) NOT NULL DEFAULT 'pt-BR' COMMENT 'Idioma do usuário (pt-BR Portugues Brasil, en Ingles, es Espanhol).',
    `FUSUARPREMIUM` CHAR(1) NOT NULL DEFAULT 'N' COMMENT 'Usuario possui conta premium (S-Sim, N-Nao).',
    `DUSUARINICIOPREMIUM` TIMESTAMP(6) NULL COMMENT 'Inicio da aquisicao da conta premium.',
    `DUSUARFIMPREMIUM` TIMESTAMP(6) NULL COMMENT 'Finalizacao da conta premium.',
    `FUSUAREMAILVERIF` CHAR(1) NOT NULL DEFAULT 'N' COMMENT 'Confirma se o email foi verificado (S-Sim, N-Nao).',
    `FUSUARTIPOUSUARIO` CHAR(1) NOT NULL DEFAULT 'C' COMMENT 'Tipo de usuario logado (A-Administrador, E-Editor, C-Comum).',
    `TUSUARDATAVERIFICACAOEMAIL` TIMESTAMP(6) NULL COMMENT 'Data e hora da verificacao do email.',
    `TUSUARDATACADASTRO` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora do cadastro.',
    `TUSUARULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PUSUAR_CHAVE` PRIMARY KEY (`CUSUARCODIGO`) USING BTREE,
    CONSTRAINT `CHECK_USUAR_FUSUARIDIOMA` CHECK ((`FUSUARIDIOMA`) IN ('pt-BR', 'en', 'es')),
    CONSTRAINT `CHECK_USUAR_FUSUARPREMIUM` CHECK ((`FUSUARPREMIUM`) IN ('S', 'N')),
    CONSTRAINT `CHECK_USUAR_FUSUAREMAILVERIF` CHECK ((`FUSUAREMAILVERIF`) IN ('S', 'N'))
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Conta do usuario.';

#####################################################################################################################

# criacao tabela de relacionamento entre usuario e ficha do jogador - Sigla = USFPG
CREATE TABLE IF NOT EXISTS `FPDD`.`TBUSUARIOFICHAPSGFPDD` (
	`CUSFPGCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do relacionamento entre usuario e ficha do jogador.',
    `CUSUARCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao do usuario.',
    `CFCHJGCODIGO` BIGINT(255) UNSIGNED NOT NULL COMMENT 'Codigo de identificacao da ficha do jogador.',
    `TUSFPGULAT` TIMESTAMP(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) COMMENT 'Data e hora da ultima atualizacao.',
    CONSTRAINT `PUSFPG_CHAVE` PRIMARY KEY (`CUSFPGCODIGO`) USING BTREE,
    CONSTRAINT `USUAR_POSSUI_USFPG` FOREIGN KEY (`CUSUARCODIGO`) REFERENCES `FPDD`.`TBUSUARIOFPDD`(`CUSUARCODIGO`),
    CONSTRAINT `FCHJG_POSSUI_USFPG` FOREIGN KEY (`CFCHJGCODIGO`) REFERENCES `FPDD`.`TBFICHAJOGADORFPDD`(`CFCHJGCODIGO`),
    CONSTRAINT `UUSFPG_POSSUI_USUAR_FCHJG` UNIQUE (`CUSUARCODIGO`, `CFCHJGCODIGO`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8MB4, COMMENT 'Relacionamento entre usuario e ficha do jogador.';

CREATE INDEX `EUSUAR_POSSUI_USFPG` ON `FPDD`.`TBUSUARIOFICHAPSGFPDD` (`CUSUARCODIGO` ASC);

CREATE INDEX `EFCHJG_POSSUI_USFPG` ON `FPDD`.`TBUSUARIOFICHAPSGFPDD` (`CFCHJGCODIGO` ASC);

#####################################################################################################################
