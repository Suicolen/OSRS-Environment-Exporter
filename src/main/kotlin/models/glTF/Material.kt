package models.glTF

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include

class Material (texture: Int) {
    @JsonInclude(Include.NON_NULL)
    class PbrMetallicRoughness(texture: Int) {
        class BaseColorTexture (val index: Int)

        val baseColorTexture = BaseColorTexture(texture)
    }

    val pbrMetallicRoughness = PbrMetallicRoughness(texture)

    val doubleSided = true
    val alphaMode = "MASK"
    val alphaCutOff = 0.0f
}
