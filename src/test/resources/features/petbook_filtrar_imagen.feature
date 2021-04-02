# language: es
Característica: Filtrado de imagenes en petbook
  Como visitante de la pagina
  Quiero filtrar las imagenes de las mascotas
  Para ver detalladamente las fotos

  Escenario: filtrar Perro
    Cuando el visitante de la pagina filtra por Perro
    Entonces debe mostrar unicamente fotos de perro

  Escenario: filtrar Gato
    Cuando el visitante de la pagina filtra por Gato
    Entonces debe mostrar unicamente fotos de gato

  Escenario: filtrar All
    Cuando el visitante de la pagina filtra por All
    Entonces debe mostrar unicamente fotos de all