package be.cytomine.formats.detectors

trait ImageMagickDetector extends Detector {
//    abstract String IMAGE_MAGICK_FORMAT_IDENTIFIER

    boolean detect() {
        String output = this.file.getImageMagickOutput()
        if(output.split(" ").size() < 2)
            return false

        return output.split(" ")[1].contains(this.IMAGE_MAGICK_FORMAT_IDENTIFIER)
    }
}