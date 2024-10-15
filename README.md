<h3>Sistema de Venta de Entradas para el Recital</h3>

<p>La consigna del día de hoy es diseñar y codificar un sistema de venta de entradas para un <strong>Recital</strong>. Un recital tendrá un <strong>nombre</strong>, una <strong>fecha</strong>, un <strong>lugar</strong> y la capacidad del evento.</p>

<p>Además de estas características, ¿qué más puede tener un recital? ¡Pues <strong>entradas</strong>! Vamos a usar una colección que nos permita obtener de manera ágil y rápida una asociación entre un <strong>tipo de entradas</strong> (es un String) y el <strong>stock</strong> de las entradas. Profundicemos en este aspecto.</p>

<p>Una entrada tiene un <strong>identificador único</strong>, un <strong>precio</strong> y un indicador de si está disponible o no. Dentro de la colección de entradas en el recital, las mismas no se deben repetir. Las entradas tendrán dos comportamientos:</p>

<ul>
  <li><strong>obtenerTipo()</strong></li>
  <li><strong>obtenerPrecioTotal()</strong></li>
</ul>

<p>Existen dos tipos de entradas:</p>
<ul>
  <li><strong>Entrada Vip</strong>: Tiene un beneficio (un String) y su precio será el precio base definido en la entrada más un 50% de su valor.</li>
  <li><strong>Entrada Normal</strong>: Interesará saber la zona (Campo, Platea, Codo). El precio no sufre modificaciones.</li>
</ul>

<p>Volviendo al recital, debemos almacenar las colecciones de entradas de manera rápida y ágil por tipo (<em>“Vip”</em> y <em>“General”</em>).</p>

<h4>Acciones posibles en un recital:</h4>
<ul>
  <li>Cargar las entradas</li>
  <li>Saber cuántas entradas por tipo se han vendido</li>
  <li>Mostrar un listado de entradas disponibles</li>
  <li>Ver el total recaudado</li>
  <li>Vender una entrada</li>
</ul>

<p>El sistema de venta de entradas funcionará tan bien que se nos pedirá hacer lo mismo pero para un <strong>PartidoDeFutbol</strong>. No se nos da mayor detalle sobre sus características, pero sí deberá permitir:</p>
<ul>
  <li>Cargar y vender entradas</li>
  <li>Saber cuántas entradas por tipo se han vendido</li>
  <li>Mostrar un listado de entradas disponibles</li>
  <li>Ver el total recaudado</li>
</ul>

<p>👉 Implementar el método <strong>toString()</strong> y <strong>equals()</strong> según corresponda. Diseñar las clases correspondientes utilizando el paradigma de la <strong>POO</strong>. Implementar un <em>main</em> para probar todo el sistema.</p>
