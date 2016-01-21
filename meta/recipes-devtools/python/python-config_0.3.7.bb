SUMMARY = "Templating library for Python"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f76b38d61d3f978b7e420a2f08c536eb"

SRC_URI = "http://www.red-dove.com/config-${PV}.tar.gz"
SRC_URI[md5sum] = "71a0dec1e627f830a767fcdd798b0d31"
SRC_URI[sha256sum] = "38c1ab79fcd62f0fa5fd4448d43efab5933e03219ce668a8caac32d044d46b37"

S = "${WORKDIR}/config-${PV}"

inherit setuptools

RDEPENDS_${PN}_class-native = ""

BBCLASSEXTEND = "native nativesdk"