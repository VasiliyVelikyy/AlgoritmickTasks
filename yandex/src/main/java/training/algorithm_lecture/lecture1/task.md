1) A. Кондиционер
    * Ограничение времени 1 секунда
    * Ограничение памяти 64Mb
    * Ввод стандартный ввод или input.txt
    * Вывод стандартный вывод или output.txt

   В офисе, где работает программист Петр, установили кондиционер нового типа. Этот кондиционер отличается особой
   простотой в управлении. У кондиционера есть всего лишь два управляемых параметра: желаемая температура и режим
   работы.

   Кондиционер может работать в следующих четырех режимах:

   a) «freeze» — охлаждение. В этом режиме кондиционер может только уменьшать температуру. Если температура в комнате и
   так не
   больше желаемой, то он выключается.

   b) «heat» — нагрев. В этом режиме кондиционер может только увеличивать температуру. Если температура в комнате и так
   не
   меньше желаемой, то он выключается.

   c) «auto» — автоматический режим. В этом режиме кондиционер может как увеличивать, так и уменьшать температуру в
   комнате до
   желаемой.

   d) «fan» — вентиляция. В этом режиме кондиционер осуществляет только вентиляцию воздуха и не изменяет температуру в
   комнате.

   Кондиционер достаточно мощный, поэтому при настройке на правильный режим работы он за час доводит температуру в
   комнате
   до желаемой.

   Требуется написать программу, которая по заданной температуре в комнате troom, установленным на кондиционере желаемой
   температуре tcond и режиму работы определяет температуру, которая установится в комнате через час.

   Формат ввода
   Первая строка входного файла содержит два целых числа troom, и tcond, разделенных ровно одним пробелом (–50 ≤ troom ≤
   50, –50 ≤ tcond ≤ 50).

   Вторая строка содержит одно слово, записанное строчными буквами латинского алфавита — режим работы кондиционера.

   Формат вывода
   Выходной файл должен содержать одно целое число — температуру, которая установится в комнате через час.

   #### Пример:

   | ввод              | вывод |
                                       |-------------------|-------|
   | 10 20 <br/>heat   | 20    |
   | 10 20 <br/>freeze | 10    |

2) B. Треугольник
   Ограничение времени 1 секунда
   Ограничение памяти 64Mb
   Ввод стандартный ввод или input.txt
   Вывод стандартный вывод или output.txt
   Даны три натуральных числа. Возможно ли построить треугольник с такими сторонами. Если это возможно, выведите строку
   YES, иначе выведите строку NO.

   Треугольник — это три точки, не лежащие на одной прямой.

   Формат ввода
   Вводятся три натуральных числа.

   Формат вывода
   Выведите ответ на задачу.

#### Пример:

| ввод            | вывод |
|-----------------|-------|
| 3 <br/>4 <br/>5 | YES   |
| 3 <br/>5 <br/>4 | YES   |
| 4 <br/>5 <br/>3 | YES   |

3) Телефонные номера
    * Ограничение времени 1 секунда
    * Ограничение памяти 64Mb
    * Ввод стандартный ввод или input.txt
    * Вывод стандартный вывод или output.txt

   Телефонные номера в адресной книге мобильного телефона имеют один из следующих форматов: +7<код><номер>, 8<код><
   номер>, <номер>, где <номер> — это семь цифр, а <код> — это три цифры или три цифры в круглых скобках. Если код не
   указан, то считается, что он равен 495. Кроме того, в записи телефонного номера может стоять знак “-” между любыми
   двумя цифрами (см. пример). На данный момент в адресной книге телефона Васи записано всего три телефонных номера, и
   он хочет записать туда еще один. Но он не может понять, не записан ли уже такой номер в телефонной книге. Помогите
   ему! Два телефонных номера совпадают, если у них равны коды и равны номера. Например, +7(916)0123456 и 89160123456 —
   это один и тот же номер.

#### Формат ввода

В первой строке входных данных записан номер телефона, который Вася хочет добавить в адресную книгу своего телефона. В
следующих трех строках записаны три номера телефонов, которые уже находятся в адресной книге телефона Васи.
Гарантируется, что каждая из записей соответствует одному из трех приведенных в условии форматов.

#### Формат вывода

Для каждого телефонного номера в адресной книге выведите YES (заглавными буквами), если он совпадает с тем телефонным
номером, который Вася хочет добавить в адресную книгу или NO (заглавными буквами) в противном случае.

#### Пример

| ввод                                                                      | вывод                     |
|---------------------------------------------------------------------------|---------------------------|
| 8(495)430-23-97<br/> +7-4-9-5-43-023-97<br/> 4-3-0-2-3-9-7 <br/>8-495-430 | <br/>YES<br/> YES<br/> NO |
| 86406361642<br/> 83341994118 <br/>86406361642<br/> 83341994118            | <br/>NO<br/> YES<br/> NO  |
| +78047952807<br/> +78047952807<br/> +76147514928 <br/>88047952807         | <br/>YES<br/> NO <br/>YES |

4) Уравнение с корнем
   Ограничение времени 1 секунда
   Ограничение памяти 64Mb
   Ввод стандартный ввод или input.txt
   Вывод стандартный вывод или output.txt
   Решите в целых числах уравнение:
   sqr(ax+b)=c
   ,

a, b, c – данные целые числа: найдите все решения или сообщите, что решений в целых числах нет.

Формат ввода
Вводятся три числа a, b и c по одному в строке.

Формат вывода
Программа должна вывести все решения уравнения в порядке возрастания, либо NO SOLUTION (заглавными буквами), если
решений нет. Если решений бесконечно много, вывести MANY SOLUTIONS.

Пример 1

| ввод             | вывод       |
|------------------|-------------|
| 1 <br/>0 <br/>0  | 0           |
| 1 <br/>2 <br/>3  | 7           |
| 3 <br/>4 <br/>5  | 7           |
| 1 <br/>2 <br/>-3 | NO SOLUTION |

5) Скорая помощь
    * Ограничение времени 1 секунда
    * Ограничение памяти 64Mb
    * Ввод стандартный ввод или input.txt
    * Вывод стандартный вывод или output.txt

Бригада скорой помощи выехала по вызову в один из отделенных районов. К сожалению, когда диспетчер получил вызов,
он
успел записать только адрес дома и номер квартиры K1, а затем связь прервалась. Однако он вспомнил, что по этому
же
адресу дома некоторое время назад скорая помощь выезжала в квартиру K2, которая расположена в подъезда P2 на этаже
N2. Известно, что в доме M этажей и количество квартир на каждой лестничной площадке одинаково. Напишите
программу,
которая вычисляет номер подъезда P1 и номер этажа N1 квартиры K1.

#### Формат ввода

Во входном файле записаны пять положительных целых чисел K1, M, K2, P2, N2. Все числа не превосходят 106.

#### Формат вывода

Выведите два числа P1 и N1. Если входные данные не позволяют однозначно определить P1 или N1, вместо соответствующего
числа напечатайте 0. Если входные данные противоречивы, напечатайте два числа –1 (минус один).

#### Пример

| ввод          | вывод |
|---------------|-------|
| 89 20 41 1 11 | 2 3   |
| 11 1 1 1 1    | 0 1   |
| 3 2 2 2 1     | -1 -1 |

