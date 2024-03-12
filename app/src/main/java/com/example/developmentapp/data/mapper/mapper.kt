package com.example.developmentapp.data.mapper

import com.example.developmentapp.data.dto.HarryPotterResponseDtoItem
import com.example.developmentapp.domain.model.HarryPotter

internal fun HarryPotterResponseDtoItem.toDomain(): HarryPotter {
    return HarryPotter(
        actor,
        alive,
        alternate_actors,
        alternate_names,
        ancestry,
        dateOfBirth,
        eyeColour,
        gender,
        hairColour,
        hogwartsStaff,
        hogwartsStudent,
        house,
        id,
        image,
        name,
        patronus,
        species,
        wand,
        wizard,
        yearOfBirth
    )
}