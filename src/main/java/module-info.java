module com.sandvoxel.rocketsim {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;

    opens com.sandvoxel.rocketsim to javafx.fxml;
    exports com.sandvoxel.rocketsim;
    exports com.sandvoxel.rocketsim.controlers;
    opens com.sandvoxel.rocketsim.controlers to javafx.fxml;
}